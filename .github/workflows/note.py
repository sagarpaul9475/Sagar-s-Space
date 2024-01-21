amnt = int(input("Enter the amount: "))
notes = [2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1]
c = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

for i in range(len(notes)):
    c[i] = amnt // notes[i]
    amnt = amnt % notes[i]

print("Count of notes:")
for i in range(len(notes)):
    if c[i] > 0:
        print(f"{notes[i]}: {c[i]}")
