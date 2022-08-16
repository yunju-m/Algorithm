#2007년
# 첫번째 일반적인 방법
day = 0
month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
week = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]
x, y = map(int, input().split())

for i in range(x-1):
	day += month[i]

day = (day+y)%7
print(week[day])

# 두번째 calendar 모듈을 이용한 방법
import calendar
week = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
x, y = map(int, input().split())
day = calendar.weekday(2007, x, y)
print(week[day])