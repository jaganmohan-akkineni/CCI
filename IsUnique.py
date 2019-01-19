def isUnique(s):
    flag = [0]*128
    
    if len(s)>128:
        return False
    else:
        for i in range(len(s)):
            if flag[ord(s[i])] == 1:
                return False
            else:
                flag[ord(s[i])] = 1
    return True

a = str(input())

print(isUnique(a))