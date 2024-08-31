from os import write

input_file = open(r"text.txt", "r")
# read the input file
output_file = open(r"output.txt", "w")
i = 1
for x in input_file:
  output_file.write( str(i) + ": " + str(x)) 
  i=i+1