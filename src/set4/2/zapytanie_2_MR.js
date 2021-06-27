db.people.mapReduce(
    function(){
        for (var idx = 0; idx <this.credit.length; idx++){
            var key = this.credit[idx].currency;
            var value = parseFloat(this.credit[idx].balance);
            emit(key,value);
        }
    },
    function(currency,balance){
        var balanceForCurrency = 0;
        for(var idx = 0; idx < balance.length; idx++){
            balanceForCurrency = balanceForCurrency+balance[idx];
        }

        return balanceForCurrency;
    },
    {
        out:{inline: 1},
        finalize: function(key, value){
            return{
                currency: key,
                money: value}
        }
    }
)