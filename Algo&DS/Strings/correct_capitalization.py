# asked in google

def allUpper(str):
    for char in str:
        ascii_code = ord(char)
        if ascii_code <=65 or ascii_code >=90:
            return False
    
    return True

def allLower(str):
    for char in str:
        ascii_code = ord(char)
        print('ascii', ascii_code)
        if ascii_code <=97 or ascii_code >=122:
            return False
    
    return True

str = "AaCDEFFF"
if len(str) == 1:
    return True
firstCapital = str[0].isupper()
secondCapital = str[1].isupper()
print('First capital', firstCapital, ord(str[0]), ord(str[0]))
print('First capital', secondCapital)
if firstCapital and secondCapital:
    # all others should be upper
    print(allUpper(str[1:]))
elif firstCapital:
    print(allLower(str[1:]))
else:
    print(allLower(str[1:]))
    