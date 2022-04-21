import pandas

data = {
    "username" : ["admin","charles","Deku"],
    "password" : ["password","Charl3","allmihd"]
}
#create dataframe
mydata = pandas.DataFrame(data)
print(mydata)
#write to csv
mydata.to_csv("sample.csv",index=False)