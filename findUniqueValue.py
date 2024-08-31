i = [1,2,3,4,5,1,2,3,4] #array of 9
x = []

for num in i:
  if num not in x:
    x.append(num)

print(x)
