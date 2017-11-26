Module UniqueNumber
    Sub Main()
        Dim uniqueNo As Integer = uniqueNumber({3, 9, 3, 4, 4, 9, 1, 1, 23, -8, 23})
        Console.WriteLine(uniqueNo)
        Console.ReadLine()
    End Sub

    Function uniqueNumber(ByVal numArray As Integer()) As Integer
        Dim tempNo As Integer
        For i As Integer = 0 To numArray.Length - 1 Step 1
            tempNo = numArray(i)
            For j As Integer = 0 To numArray.Length - 1 Step 1
                If tempNo = numArray(j) And i <> j Then
                    Exit For
                ElseIf j = numArray.Length - 1 Then
                    Return tempNo
                End If
            Next
        Next
        Return -1
    End Function
End Module
