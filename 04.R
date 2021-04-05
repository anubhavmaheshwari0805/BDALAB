x=airquality
print("Dimensions of airquality dataset : ")
print(dim(x))

print("Class of every column in dataset : ")
sapply(x,class)

colSums(is.na(x))

x1=as.data.frame(x)
for(i in 1:ncol(x1)) {
  x1[,i]=ifelse(is.na(x1[,i]),mean(x1[,i],na.rm = T),x1[,i])
}
print(x1)

x2=na.omit(x)
print(x2)
