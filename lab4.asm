#Katerina Cowan
#This will be about the video game Valorant 

.intel_syntax noprefix
.data

First: 
	.ascii "Did you lose first pistol round? (1=yes 2=no)\n\0"
Reyna: 
	.ascii "Does your Reyna bait the team? (1=yes 2=no)\n\0"
Jett: 
	.ascii "Did your Jett get mad and leave the game? (1=yes 2=no)\n\0"
Smokes: 
	.ascii "Does your Omen forget to smoke? (1=yes 2=no)\n\0"
Total:
	.ascii "Your total stress level is at \0" 
Stressed: 
	.ascii "\nYou are too stressed, you are going to lose!\n\0"
NotStressed:
	.ascii "\nYou are calm so you should win!\n\0"
 
.text 
.global _start

_start: 

Question1:
	lea rdx, First
	call PrintZString 
	call ScanInt
	cmp rdx, 2
	je Question2

	add rcx, 100

Question2: 
	lea rdx, Reyna
	call PrintZString 
	call ScanInt 
	cmp rdx, 2
	je Question3 

	add rcx, 200 

Question3:
	lea rdx, Jett
	call PrintZString
	call ScanInt
	cmp rdx, 2
	je Question4
	
	add rcx, 300

Question4: 
	lea rdx, Smokes
	call PrintZString
	call ScanInt
	cmp rdx, 2
	je Results
	
	add rcx, 400 

Results:
	lea rdx, Total
	call PrintZString
	mov rdx, rcx
	call PrintInt
Value:
	cmp rdx, 500
	jge  NotCalm
	jmp  Calm

NotCalm:
	lea rdx, Stressed
	call PrintZString
	jmp End
Calm: 
	lea rdx, NotStressed
	call PrintZString
End:

	call Exit

