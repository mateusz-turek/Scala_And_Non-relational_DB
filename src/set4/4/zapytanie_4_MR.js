db.people.mapReduce(
    function(){
        var key = this.nationality
        var value = {w : parseFloat(this.weight),
            h: parseFloat(this.height)}
        emit(key,value)
    },
    function(key,value){
        var lowestBmi = 0;
        var highestBmi = 0;
        var avgBmi = 0;
        var currentBmi = 0;
        var counter = 0;
        var sumBmi = 0;

        for(var idx = 0; idx < value.length; idx++){
            counter++;
            let w = value[idx].w;
            let h = value[idx].h;
            currentBmi = w / ((h/100)*(h/100));
            sumBmi = sumBmi + currentBmi;
            if (currentBmi > highestBmi){
                highestBmi = currentBmi;
            }
            if (currentBmi < lowestBmi || lowestBmi === 0){
                lowestBmi = currentBmi;
            }
        }

        avgBmi =  sumBmi/counter;

        let bmiInfo = {avg: avgBmi,
            lowest: lowestBmi,
            highest: highestBmi}

        return bmiInfo;
    },
    {
        out:{inline: 1},
        finalize: function(key, value){
            return value;
        }
    }
)