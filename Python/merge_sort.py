def merge(arr,l,m,r):
    nl = m-l+1
    nr = r-m
    L = []
    R = []
    for i in range(nl):
        L.append(arr[l+i])
    for i in range(nr):
        R.append(arr[m+i+1])
    i = 0
    j = 0
    k = l
    while i<nl and j<nr:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i+=1
        else:
            arr[k] = R[j]
            j+=1
        k+=1
    while i < nl:
        arr[k] = L[i]
        i+=1
        k+=1
    
    while j < nr:
        arr[k] = R[j]
        j+=1
        k+=1
    
def merge_sort(arr,l,r):
    if l<r:
        m = (l+r-1)//2
        merge_sort(arr,l,m)
        merge_sort(arr,m+1,r)
        merge(arr,l,m,r)


arr = [12, 11, 13, 5, 6, 7]
n = len(arr)
print ("Given array is")
for i in range(n):
    print ("%d" % arr[i],end = " ")
  
merge_sort(arr,0,n-1)
print ("\n\nSorted array is")
for i in range(n):
    print ("%d" % arr[i], end = " ")




