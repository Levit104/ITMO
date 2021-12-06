with open('timetable.yml', encoding='utf-8') as inputFile:
    yamlFile = inputFile.readlines()

subjects = []; teachers = []; times = []; classrooms = []; locations = []; weeks = []; formats = []
# списки, где будут лежать элементы расписания (названия предметов в subjects, адреса в locations и т.д.)

for line in yamlFile:
    line = line.replace('  ', '').replace('\n', '').replace(' ', '', 1).replace('"', '')
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

lessons = []
lessonCount = len(subjects)
for i in range(lessonCount):
    i += 1
    # прибавляем 1, чтобы не было lesson0
    lessons.append(f'lesson{i}')
# счёт кол-ва пар

csvFile = ''
for n in range(lessonCount):
    csvFile += f'timetable.tuesday.{lessons[n]}.subject;'
    csvFile += f'timetable.tuesday.{lessons[n]}.teacher;'
    csvFile += f'timetable.tuesday.{lessons[n]}.time;'
    csvFile += f'timetable.tuesday.{lessons[n]}.classroom;'
    csvFile += f'timetable.tuesday.{lessons[n]}.location;'
    csvFile += f'timetable.tuesday.{lessons[n]}.week;'
    csvFile += f'timetable.tuesday.{lessons[n]}.format;'
    if n == lessonCount - 1:
        csvFile = csvFile[:-1]
        csvFile += '\n'
        # если это последняя итерация цикла, то удалить полсдений символ (;) и сделать перенос строки
# составление 1-ой строчки

for n in range(lessonCount):
    csvFile += f'{subjects[n]};'
    csvFile += f'{teachers[n]};'
    csvFile += f'{times[n]};'
    csvFile += f'{classrooms[n]};'
    csvFile += f'{locations[n]};'
    csvFile += f'{weeks[n]};'
    csvFile += f'{formats[n]};'
    if n == lessonCount - 1:
        csvFile = csvFile[:-1]
# составление 2-ой строчки

with open('timetable.csv', 'w', encoding='utf-8') as outputFile:
    outputFile.write(csvFile)