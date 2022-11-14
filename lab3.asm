#katerina cowan
.intel_syntax noprefix	
.data 


Pistol: 
	.ascii "1. Sheriff (800 creds)\n\0"
Light: 
	.ascii "2. Judge (1850 creds)\n\0"
Buy: 
	.ascii "3. Vandal (2900 creds)\n\0"
 
Weapons:
        .quad Pistol
        .quad Light
        .quad Buy
Cost:
        .quad 800
        .quad 1850
        .quad 2900


Selection: 
	.ascii "Enter your selection:\n\0"
Selected: 
	.ascii "You selected:\n\0"
Creds: 
	.ascii "How many creds do you have:\n\0"
Change: 
	.ascii " is your change \n\0"
.text
.global _start
_start:

#Part 1 
	lea rdx, Pistol  
	call PrintZString
	lea rdx, Light
        call PrintZString
	lea rdx, Buy
        call PrintZString


#Part 2 	
	lea rdx, Selection
	call PrintZString
	call ScanInt 
  	mov rsi, rdx
#Part 3
	lea rdx, Selected 
	call PrintZString 

	sub rsi, 1 
	mov rdx, [Weapons + rsi * 8] 
	call PrintZString
#Part 4 
	lea rdx, Creds
	call PrintZString
	call ScanInt
#Part 5 
	sub rdx, [Cost + rsi * 8]
	call PrintInt
	lea rdx, Change
        call PrintZString
	 

	call Exit 

