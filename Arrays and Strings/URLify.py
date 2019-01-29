"""def URLify(url, n):
    modurl = ""
    j=0
    for i in range(n):
        if ord(url[i]) == 32:
            modurl[j], modurl[j+1], modurl[j+2] = '%', '2', '0'
            j += 3
        else:
            modurl[j] = url[i]
            j += 1
    return modurl
"""

def URLify(url, truelength):
    spacecount = 0
    for i in range(truelength):
        if url[i]==' ':
            spacecount += 1
    index = truelength + 2*spacecount
    if truelength < len(url): 
        url[index] = '\0'
    i = truelength-1
    while(i>=0):
        if url[i] == ' ':
            url[index-1] = '0'
            url[index-2] = '2'
            url[index-3] = '%'
            index -= 3
            i -= 1
        else:
            url[index-1] = url[i]
            index -= 1
            i -= 1
    return url
url = (input())
print(URLify(url,len(url)))