#Katerina Cowan
#This will be about Valorant

.intel_syntax noprefix
.data

Welcome: 
	.ascii "Welcome to Valorant! Lets determine who you should play!\n\0"
Type:
	.ascii "Do you like to play a support role? (y/n)\n\0"
Support:
	.ascii "Do you like to use util? (y/n)\n\0"
Controller:
	.ascii "You would play as a controller!\n\0"
Sentinel:
	.ascii "You play as a sentinel!\n\0" 
Entry:
	.ascii "Do you like to use util for information? (y/n)\n\0"
Initiator: 
	.ascii "You would play as a initiator!\n\0"
Duelist:
	.ascii "You would play as a duelist!\n\0"

.text
.global _start

_start: 

Hello:
	lea rdx, Welcome
	call PrintZString
Question1: 
	lea rdx, Type
	call PrintZString
	call ScanChar
	cmp dl, 121
	jne Question2
	je Question3
Question2: 
	lea rdx, Entry
	call PrintZString
	call ScanChar
	cmp dl, 121 
	je Result2
	jne Result1
Result1: 
	lea rdx, Duelist
	call PrintZString
	jmp End
Result2:
	lea rdx, Initiator
	call PrintZString
	jmp End
Question3: 
	lea rdx, Support
	call PrintZString
	call ScanChar
	cmp dl, 121
	je Result3
	jne Result4
	
Result3:
	lea rdx, Controller
	call PrintZString
	jmp End
Result4:
	lea rdx, Sentinel
	call PrintZString
	jmp End
End:	
	call Exit 

