string1 = str(input())
string2 = str(input())

"""string1 = ''.join(sorted(string1))
string2 = ''.join(sorted(string2))

print(string1 == string2)"""

letters = [0]*128
def checkPermutation(string1, string2):
    if len(string1) != len(string2): return False
    for i in range(len(string1)):
        letters[ord(string1[i])] = letters[ord(string1[i])] + 1

    for i in range(len(string2)):
        letters[ord(string2[i])] = letters[ord(string2[i])] - 1
        if letters[ord(string2[i])]<0:
            return False
    return True

print(checkPermutation(string1, string2))