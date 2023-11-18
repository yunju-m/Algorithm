N = int(input())
people = list(map(int, input().split()))
B, C = map(int, input().split())
result = 0
for person in people:
    person -= B
    result += 1
    if person > 0:
        result += person // C
        person = person % C
        if person != 0:
            result += 1

print(result)