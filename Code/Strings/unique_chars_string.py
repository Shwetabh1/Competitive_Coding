# Determine if a string has all unique characters or not

def find_unique_string(str):
    str_dict = {}
    for char in str:
        cur_value = str_dict.get(char, 0)
        str_dict[char] = cur_value + 1
        if cur_value + 1 != 1:
            return "NOT UNIQUE"
    else:
        return "UNIQUE"
    

# test it on various inputs

# empty string
print(find_unique_string(''))
print(find_unique_string('AA'))
print(find_unique_string('AAAAAAAAAAAAAAAAAAAAAAAAA'))
print(find_unique_string('ABCDEFGHIJKLMNOPQRSTUVWXYZ'))
print(find_unique_string(''))
print(find_unique_string('AA'))
print(find_unique_string('X'))
