#lab2.asm
#Katerina Cowan
.intel_syntax noprefix
.data 

Name: 
	.byte 'K' 
	.byte 'a'
	.byte 't'
	.byte 'e'
	.byte 'r'
	.byte 'i'
	.byte 'n'
	.byte 'a'
	.byte '\n'
	.byte 0
	 
Earnings:
	.ascii "How much did you earn this month?\n\0"

EarningsAmount: 
	.quad 0

FirstExpense:	 
	.ascii "How much did you spend on Valorant?\n\0"

FirstExpenseAmount:
	.quad 0 

SecondExpense:
	.ascii "How much did you spend on Doordash?\n\0"

SecondExpenseAmount: 
	.quad 0

ExpenseTotal:
	.ascii "Your expenses are \n\0"
 
CashFlow:
	.ascii "So, your cash flow is \0" 
 
	
.text
.global _start
_start: 
	lea rdx, Name 
	call PrintZString

	lea rdx, Earnings
	call PrintZString
 
	call ScanInt
	mov EarningsAmount, rdx	 

	lea rdx, FirstExpense
	call PrintZString

	call ScanInt	
	mov FirstExpenseAmount, rdx
	
	lea rdx, SecondExpense
        call PrintZString

	call ScanInt
        mov SecondExpenseAmount, rdx 

	lea rdx, ExpenseTotal
	call PrintZString

	mov rdx, FirstExpenseAmount
	add rdx, SecondExpenseAmount
	mov ExpenseTotal, rdx 
	call PrintInt
	
	lea rdx, CashFlow
	call PrintZString

	mov rdx, EarningsAmount
	sub rdx, ExpenseTotal
	call PrintInt
	
	

	call Exit
	
