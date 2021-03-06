empid=vector(mode="character")
empname=vector(mode="character")
doj=vector(mode="character")
dept=vector(mode="character")
designation=vector(mode="character")
num=readline("Enter the number of employee : ")
for(i in 1:num) {
  empid[i]<-readline("Enter EmpID : ")
  empname[i]<-readline("Enter EmpName : ")
  doj[i]<-readline("Enter Date of Joining : ")
  dept[i]<-readline("Enter Department : ")
  designation[i]<-readline("Enter Designation : ")
}

employee<-data.frame(EmpID=empid,EmpName=empname,DOJ=doj,Dept=dept,Designation=designation)
print("Data Frame Employee Data : ")
print(employee)

write.csv(employee,"./02.csv",row.names=F)

data<-read.csv("./02.csv")
print("Data from CSV File : ")
print(data)

print("Enter the detalis of new employee : ")
eid=readline("Employee ID : ")
ename=readline("Employee Name : ")
edoj=readline("Employee Date of Joining : ")
edept=readline("Employee Department : ")
edesign=readline("Employee Designation : ")
df<-data.frame(EmpID=eid,EmpName=ename,DOJ=edoj,Dept=edept,Designation=edesign)
write.table(df,"./02.csv",append=T,sep=",",col.names=F,row.names=F,quote=F)
newdata=read.csv("./02.csv")
print("New Appended Data in CSV File : ")
print(newdata)