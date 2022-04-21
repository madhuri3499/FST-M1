import pandas

dataframe = pandas.read_csv("sample.csv")
print(dataframe)

print("Username")
print(dataframe["username"])

print("password")
print(dataframe["password"])

print(dataframe.sort_values('username'))

print(dataframe.sort_values('username',ascending=False))