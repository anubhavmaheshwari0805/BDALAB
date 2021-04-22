data()

x=data.frame(mtcars)
head(x)
nr=nrow(x)
nc=ncol(x)
paste("Number of rows in mtcars : ",nr)
paste("Number of columns in mtcars : ",nc)

auto=0
man=0
for(i in 1:nr)
  ifelse(x[i,9]==1,man<-man+1,auto<-auto+1)
paste("No. of Automatic Cars : ",auto)
paste("No. of Manual Cars : ",man)

HorsePower=x[,4]
Weight=x[,6]
scatter.smooth(HorsePower,Weight)

x[,2]=as.integer(x[,2])
x[,8]=as.integer(x[,8])
x[,9]=as.integer(x[,9])
newmtc<-x

print("Cars with no. of cylinders less than 5 : ")
newmtc[newmtc$cyl<=5,]