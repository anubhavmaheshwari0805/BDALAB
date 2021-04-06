x=airquality
print("Dimensions of airquality dataset : ")
print(dim(x))

print("Class of every column in dataset : ")
sapply(x,class)

print("Number of missing values in every columns : ")
colSums(is.na(x))

x1=as.data.frame(x)
for(i in 1:ncol(x1))
  x1[,i]=ifelse(is.na(x1[,i]),mean(x1[,i],na.rm = T),x1[,i])
print("Datatset after replacing missing values with column mean value : ")
print(head(x1))

x2=na.omit(x)
print("Dataset after omiting missing value rows : ")
print(head(x2))
