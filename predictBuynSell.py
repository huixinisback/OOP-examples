prices = [7,1,5,3,6,4]
range = 0
for num in prices:
  
  if num < prices[range]:
    print("buy")
    if num> prices[range]:
      print("sell")
  range+=1

print(range)
