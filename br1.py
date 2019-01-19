import math

pp,ch = map(float, input().split(';'))

coins = [['PENNY', 'NICKEL', 'DIME', 'QUARTER', 'HALF DOLLAR', 'ONE', 'TWO', 'FIVE', 'TEN', 'TWENTY', 'FIFTY', 'ONE HUNDRED'],
        [.01, 0.05, 0.10, 0.25, 0.50, 1.00, 2.00, 5.00, 10.00, 20.00, 50.00, 100.00]]

op = []

if ch<pp:
    print("ERROR")
elif ch == pp:
    print("ZERO")
else:
    a = (ch - pp)
    print(a)
    i=11
    while i>=0:
        if a>=coins[1][i]:
            op.append(coins[0][i])
            while a>=coins[1][i]:
                a = a -coins[1][i]
                print(a)
        else:
            i -= 1

op.sort()

print(','.join([op[x] for x in range(len(op))]))