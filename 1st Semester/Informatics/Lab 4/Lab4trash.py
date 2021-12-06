"""
try:
    for line in data:
        # line = line.replace('  ', '').replace('\n', '').replace(' ', '', 1).replace('"', '')
        line = re.sub('\s\s', '', line)
        line = re.sub('\n', '', line)
        line = re.sub('\s', '', line, 1)
        line = re.sub('\"', '', line)
        # замена всех отступов и переносов строк, а также кавычек (если есть)
        key, value = line.split(':', 1)
        if key == 'subject':
            subjects.append(value)
        if key == 'teacher':
            teachers.append(value)
        if key == 'time':
            times.append(value)
        if key == 'classroom':
            classrooms.append(value)
        if key == 'location':
            locations.append(value)
        if key == 'week':
            weeks.append(value)
        if key == 'format':
            formats.append(value)
        # заполнение списков (элементов расписания)
except ValueError:
    print('Неправильный файл')
"""

"""
while True:
    ask = input('Чтобы вывести на экран результат работы программы ввведите ДА/НЕТ.'
                '\nЧтобы завершить работу введите EXIT.\nВвод: ')
    if ask == 'НЕТ':
        print(f'Время выполнения программы: {endTime - startTime} секунд.')
        break
    if ask == 'ДА':
        print(xmlFile)
        print(f'Время выполнения программы: {endTime - startTime} секунд.')
        break
    if ask == 'EXIT':
        break
    else:
        print('Вы ввели неправильное значение')
"""

"""words = 'subject teacher time classroom location week format'.split(' ')
# ключевые слова
for line in data:
    line = line.replace("  ", "").replace('\n', '').replace(" ", "", 1).replace('"', '')
    # замена всех отступов и переносов строк, а также кавычек (если есть)
    key, value = line.split(':', 1)
    if key in words:
        if key == 'subject':
            subjects.append(value)
        if key == 'teacher':
            teachers.append(value)
        if key == 'time':
            times.append(value)
        if key == 'classroom':
            classrooms.append(value)
        if key == 'location':
            locations.append(value)
        if key == 'week':
            weeks.append(value)
        if key == 'format':
            formats.append(value)
    # заполнение списков (элементов расписания)"""


m = 'Привет'
n = 'Мир'
s = dict()
s.update({m: n})

with open('timetable.yml', encoding='utf-8') as inputFile:
    data = inputFile.readlines()

schedule = dict()

for line in data:
    line = line.replace('  ', '').replace('\n', '').replace(' ', '', 1).replace('"', '')
    # замена всех отступов и переносов строк, а также кавычек (если есть)
    key, value = line.split(':', 1)
    if key == 'subject':
        schedule.update({key: value})
    if key == 'teacher':
        schedule.update({key: value})
    if key == 'time':
        schedule.update({key: value})
    if key == 'classroom':
        schedule.update({key: value})
    if key == 'location':
        schedule.update({key: value})
    if key == 'week':
        schedule.update({key: value})
    if key == 'format':
        schedule.update({key: value})
    # заполнение списков (элементов расписания)

print(schedule)
xml = dicttoxml.dicttoxml(schedule)
print(xml)