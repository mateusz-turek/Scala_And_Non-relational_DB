db.people.mapReduce(
    function(){
        var nationality = this.nationality;
        var sex = this.sex;
        for (var idx = 0; idx <this.credit.length; idx++){
            var currency = this.credit[idx].currency;
            var key = nationality + "_" + sex + "_" + currency;
            var balance = parseFloat(this.credit[idx].balance);

            emit(key,balance);
        }
    },
    function(key,value){
        var currentValue;
        var wholeBalance = 0;
        var counter = 0;
        value.forEach(function (amount){
            counter ++;
            currentValue = amount;
            wholeBalance = wholeBalance + currentValue;
        })
        var avgBalance = wholeBalance/counter;
        var balanceInfo = {wholeBalance: wholeBalance,
            avgBalance: avgBalance}
        return balanceInfo;
    },
    {
        out:{inline: 1},
        query: {"nationality": "Poland","sex": "Female"},
        finalize: function(key, value){
            return value;
        }
    }
)