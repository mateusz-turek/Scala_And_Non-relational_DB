import riak

myClient = riak.RiakClient()  # no param = localhost

myBucket = myClient.bucket('s23101')

data1 = {'name': 'sampleName'}
key1 = myBucket.new('sampleKey', data=data1)
key1.store()

fetched1 = myBucket.get('sampleKey')
print("read inserted")
print(fetched1.encoded_data)

data2 = {'name': 'Name',
         'Lastname': 'sampleLastname'}
key1 = myBucket.new('sampleKey', data=data2)
key1.store()

fetched1 = myBucket.get('sampleKey')
print("read modified")
print(fetched1.encoded_data)

fetched1.delete()

assert myBucket.get('sampleKey').exists == False

fetched1 = myBucket.get('sampleKey')

print("read deleted")
print(fetched1.encoded_data)
