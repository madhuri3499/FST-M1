
def CalculateSum(num):
    if num:
        return num + CalculateSum(num-1)
    else:
        return 0

print(CalculateSum(3))
    