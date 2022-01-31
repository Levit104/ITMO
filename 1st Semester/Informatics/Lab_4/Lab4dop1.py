import time
# модуль для работы со временем
import yaml
# модуль, который позволяет открыть файл YAML как словарь Питона
import dict2xml
# модуль который конвертирует словарь Питона в XML

startTime = time.perf_counter()
# начало отсчёта времени

with open('timetable.yml', encoding='utf-8') as inputFile:
    yamlFile = yaml.safe_load(inputFile)

xmlFile = dict2xml.dict2xml(yamlFile, indent='\t')

with open('timetable.xml', 'w', encoding='utf-8') as outputFile:
    outputFile.write(xmlFile)

endTime = time.perf_counter()
# конец отсчёта времени
finalTime = round(endTime - startTime, 8)
print(f'Время выполнения программы {finalTime} секунд.')