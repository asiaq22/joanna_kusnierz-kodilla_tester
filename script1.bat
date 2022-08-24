echo Start
mkdir project
del build\libs\*.jar
./gradlew build
if exist build\libs\*.jar goto copyfile
echo File doesnt exist
goto end

:copyfile
copy build\libs\*.jar project

:end
