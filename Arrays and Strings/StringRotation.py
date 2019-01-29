def StringRotation(s1, s2):
    if len(s1) == len(s2):
        s2 = s2 + s2

        if s1 in s2:
            return True
        else:
            return False

if __name__ == '__main__':
    print(StringRotation('waterbottle', 'erbottlewat'))