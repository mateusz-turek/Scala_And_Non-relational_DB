db.people.mapReduce(
    function(){
        var heightAndWeightInfo = { weight: parseFloat(this.weight),
            height: parseFloat(this.height)}
        var sex = this.sex;
        emit(sex,heightAndWeightInfo)

    },
    function(key,value){
        var counter = 0;
        var sumWeight = 0;
        var sumHeight = 0;
        value.forEach(function (singlePersonInfo){
            counter++;
            var currentWeight = singlePersonInfo.weight;
            sumWeight = sumWeight + currentWeight;
            var currentHeight = singlePersonInfo.height;
            sumHeight = sumHeight + currentHeight;

        })
        var avgWeight = sumWeight / counter;
        var avgHeight = sumHeight / counter ;
        var info = {avgWeight: avgWeight,
            avgHeight: avgHeight}
        return info;
    },
    {
        out:{inline: 1},
        finalize: function(key, value){
            return value;
        }
    }
)