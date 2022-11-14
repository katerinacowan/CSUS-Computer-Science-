# lab1.asm
# KaterinaCowan

# 1. Assemble : as -o lab1.o lab1.asm
# 2. Link : ld -o a.out lab1.o csc35.o
# 3. Execute : ./a.out

 .intel_syntax noprefix
 .data
 Greeting: 
	.ascii "Hello, world!\n\0"
 Name:
	.ascii "My name is Katerina Cowan\n\0"
 Quote: 
	.ascii "The Joker is my favorite villain of all time: You don't know his past; you just know what his plans are - The Weeknd\n\0"
 Year: 
	.ascii "2016 was a great year for me because the music, internet, and society seemed to be much better, idk why\n\0" 
 .text
 .global _start

_start: 
	lea rdx, Greeting
	call PrintZString
	lea rdx, Name
	call PrintZString
	lea rdx, Quote
	call PrintZString
	lea rdx, Year
	call PrintZString
	
	call Exit
