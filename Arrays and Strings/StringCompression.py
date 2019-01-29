def StringCompression(str1):
    count = 1
    str2 = ''
    for i in range(1, len(str1)):
        if str1[i-1] == str1[i]:
            count += 1
        else:
            str2 = str2 + str1[i-1] + str(count)
            count = 1
        
        print(str2)
    str2 = str2 + str1[len(str1)-1] + str(count)
    if len(str1)<len(str2):
        return str1
    else: 
        return str2

if __name__ == '__main__':
    print(StringCompression('aaaaaaabcd'))

'''
String concatenation problem in python: instead of creating new string in every 
iteration, use a list and join them at the end.
def stringBuilderPython():
    list = []
    for i in range(90,110):
        list.append(chr(i))
    
    return ''.join(list)
'''