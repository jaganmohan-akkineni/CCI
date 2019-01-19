def OneAway(str1, str2):
    flag1, flag2 = [0]*128, [0]*128 
    if(abs(len(str1)-len(str2))>1):
        return False
    else:
        for i in range(len(str1)):
            flag1[ord(str1[i])] += 1
        for i in range(len(str2)):
            flag2[ord(str2[i])] += 1
        diff = 0
        for i in range(128):
            if flag1[i] != flag2[i]:
                diff += 1
        if diff > 2:
            return False
    return True

if __name__ == '__main__':
    print(OneAway('peaks', 'geeks'))