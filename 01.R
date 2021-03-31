usn=vector(mode="character")
names=vector(mode="character")
marks=vector(mode="integer")
number=readline("Enter number of students : ")
for(i in 1:number)
{
  usn[i]=readline("Enter USN : ")
  names[i]=readline("Enter Name : ")
  marks[i]=readline("Enter marks : ")
}
students<-data.frame(USN=usn, NAME=names, MARKS=marks)
print("Data Frame of Students : ")
print(students)

ages<-vector(mode="integer")
print("Enter Age of Students : ")
for(i in 1:nrow(students)) {
  ages[i]<-readline("Enter Age : ")
}
students=cbind(students,AGE=ages)
print("Updated Data Frame with extra Column : ")
print(students)

filstudents<-subset(students,AGE<20 & MARKS>25)
print("Students With Age<20 and Marks>25 : ")
print(filstudents)