input_filename = input("What is the name of your input file?")

output_filename = input("What is the name of your output file?")
input_file = open(input_filename, "r") # r for read
# read the input file
output_file = open(output_filename, "w") # w for write

i = 1 # variable for increment
for x in input_file:
  output_file.write( str(i) + ": " + str(x)) 
  i=i+1

input_file.close()
output_file.close()
