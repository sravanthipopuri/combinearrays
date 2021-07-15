FROM openjdk:8
COPY . /src/myapp
WORKDIR /src/myapp
RUN javac CombineSortedArrays.java
CMD ["java", "CombineSortedArrays" "[1,4,8,10,11]" "[2,3,6,9,15,25,37]"]