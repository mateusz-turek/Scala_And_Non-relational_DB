db.people.mapReduce(
    function(){
        var key = null
        var value = this.job
        emit(key,value)
    },
    function(key,value){
        var jobSet = new Set();
        value.forEach(function(job){
            jobSet.add(job);
        })
        var occurrences
        var tempArr = []
        jobSet.forEach(function(setJob){
            occurrences = 0;
            value.forEach(function (job){
                if(setJob === job){
                    occurrences++
                }
            })
            var occ = {
                jobName : setJob,
                occurrences: occurrences
            }
            tempArr.push(occ);
        })
        return tempArr;
    },
    {
        out:{inline: 1},
        finalize: function(key, value){
            var uniqueJob = [];
            value.forEach(function (jobOccurrence){
                if(jobOccurrence.occurrences === 1){
                    uniqueJob.push(jobOccurrence);
                }
            })

            return uniqueJob;
        }
    }
)