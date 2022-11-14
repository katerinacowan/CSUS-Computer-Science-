#Katerina Cowan

.intel_syntax noprefix
.data 

Welcome: 
	.ascii "Welcome! Today you will be guessing the secret number. The number I need will be betweeen 1 and 100. Please guesss wisely!\n\0"
Guess:
	.ascii "Guess: \n\0"
Large: 
	.ascii "That is too large!\n\0" 
Small:
	.ascii "That is too small!\n\0"
Correct: 
	.ascii "Finally you guessed it! It took you long enough...\n\0" 
.text 
.global _start

_start:  
	lea rdx, Welcome
	Call PrintZString
	mov rdx, 100
	call Random
	add rdx, 1
	mov rbx, rdx 
	
Question: 
	lea rdx, Guess
	call PrintZString 
	call ScanInt
	cmp rdx, rbx
	jg Big
	jl Little
	je Right
Big:
	lea rdx, Large
	call PrintZString
	jmp Question
Little:
	lea rdx, Small
	call PrintZString
	jmp Question
Right:
	lea rdx, Correct
	call PrintZString
	call Exit

