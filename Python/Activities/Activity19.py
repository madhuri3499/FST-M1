import pandas

data = {
    'FirstName': ["madhu","John","Charme"],
    'lastName': ["G","b","K"],
    'Email': ["madhu@gmail.com","John@gmail.com","ck@gmail.com"],
    "Mobile": ["2324423","23433242","78968734"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = pandas.ExcelWriter("sample.xlsx")
dataframe.to_excel(writer, 'Emp', index = False)
 
# Commit data to the Excel file
writer.save()