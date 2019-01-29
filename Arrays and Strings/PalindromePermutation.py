def getFreqTable(string):
    table = [0] * (ord('z')-ord('a')+1)
    length = 0
    for i in range(len(string)):
        if ord(string[i]) >= ord('a') and ord(string[i]) <= ord('z'):
            table[ord(string[i]) - ord('a')] += 1
            length += 1
    return table, length

def isPalindromePermutation(string):
    
    table, length = getFreqTable(string)

    print(length)
    if length%2 == 0:
        for i in range(len(table)):
            if table[i]%2 != 0:
                return False
        return True
        
    else:
        foundOdd = 0
        for i in range(len(table)):
            if table[i]%2 == 1:
                if foundOdd == 0:
                    foundOdd = 1
                else:
                    return False
        return True
        
a = str(input())
a = a.lower()
print(a)
print(isPalindromePermutation(a))