#Katerina Cowan 

.intel_syntax noprefix
.data 

Welcome: 
	.ascii "Welcome to Valorant!\nWritten by Katerina\n\0"
Players: 
	.ascii "How many players? \0"
PlayerInfo:
	.ascii "\nPlayer: \0"
Health:
	.ascii "\nHealth: \0"
Target: 
	.ascii "\nWho is your target?\0"
Damage1:
	.ascii "You did \0"
Damage2:
	.ascii " damage\n\0"
Die:
	.ascii "This player died\n\0"
#Didn't end up using
Winner:
	.ascii "You win!\n\0"
#tables
PlayerNumber: 
	.quad 0
	.quad 1
	.quad 2
	.quad 3
	.quad 4
	.quad 5
	.quad 6
	.quad 7
	.quad 8
	.quad 9

PlayerHealth:
        .quad 100
        .quad 100
        .quad 100
        .quad 100
        .quad 100
        .quad 100
        .quad 100
        .quad 100
        .quad 100
        .quad 100

#ascii art
Valorant: 
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⠋⠀⠀⠀⠀⠀⢀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
	.ascii "⠛⢻⣿⣿⠟⠛⣻⡟⠛⣻⡟⢻⣿⣿⣿⠿⠛⠛⠛⢿⣿⡟⠛⠛⠛⠛⢻⣿⠛⢿⣿⣿⡟⠛⢿⣿⣿⡟⢻⠛⠛⠛⠛⠻\n"
	.ascii "⠇⢸⡿⠋⣠⣾⠋⢀⠀⣿⡇⢸⣿⣿⠇⢠⣾⣿⣦⡀⢹⡇⢰⣿⠇⢀⣾⣿⠀⡀⠹⣿⡇⠀⡀⠹⣿⡇⢸⣿⣷⠀⣿⣿\n"
	.ascii "⠀⠘⢀⣴⠟⠁⡀⠙⠀⣿⡇⢸⣿⣿⡄⠸⣿⣿⡿⠁⣸⡇⠸⣧⡀⠻⣿⣿⠀⠃⣀⠈⢻⣄⣿⣄⠈⠁⢸⣿⣿⠀⣿⣿\n"
	.ascii "⣄⣠⣿⣏⣠⣾⣿⣦⣄⣿⣇⣤⣤⣤⣿⣦⣄⣁⣠⣶⣿⣇⣠⣿⣷⣄⣈⣿⣠⣴⣿⣷⣄⣹⣿⣿⣷⣄⣼⣿⣯⣠⣿⣿\n\0"
Jett:
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣛⣉⡉⠉⣉⣉⣉⣉⣉⣉⣛⠻⢿⣿⣿⣿⣿⣿⡿⠿⠿⣛⣛⣛⣛⣛⡛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⠟⢉⣴⣿⠿⢋⣴⣟⣫⣥⣤⣌⢙⢻⣮⠙⣷⣽⠿⠛⣫⣤⣴⣾⣿⣿⣿⣿⣿⣿⣿⣷⣤⡙⣛⣛⣛⣛⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⠟⣡⣼⣿⣿⢋⣼⣿⣿⣿⣿⣿⣿⣿⣆⢣⠿⠀⣋⣤⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣙⠛⢿⣋⡿⣷⣤⣉⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⠏⣴⣿⣿⣿⠇⣼⣿⣿⣿⣿⣿⣿⣿⡿⠋⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⡙⢷⣶⣶⣤⣤⣤⣉⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⡏⣠⣿⣿⣿⡿⢀⣿⣿⣿⡏⠍⢉⡴⠊⢠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢄⠻⣿⣿⣿⣿⣿⣿⣷⣮⣉⠻⢿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⡿⢰⣿⣿⣿⣿⠁⣬⣭⣭⣥⠶⠾⠋⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠛⠦⠀⠉⠙⠻⢿⣿⣿⣿⣿⣿⣷⣦⣙⢿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⡇⢸⣿⣿⣿⣿⠀⢿⡿⠋⢁⡠⠒⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⢏⣱⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⢀⠈⣀⣀⣀⡀⠚⢿⣶⣮⡹⢿⣿⣿⣿⣯⠻⣦⠹⣿⣿⣿⣿\n"
        .ascii "⣿⠇⢸⣿⣿⣿⣿⣷⣶⣶⡾⢋⣤⠂⢀⣿⣿⣿⣿⣿⣿⣿⡿⢃⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠂⣠⣾⣾⣿⣿⣿⣮⠢⡀⢻⣿⣿⡌⢿⣿⣿⣿⣇⠻⣧⢹⣿⣿⣿\n"
        .ascii "⡟⠀⣀⠹⢿⣿⠿⠿⠛⢋⣴⣿⡏⠀⣾⣿⣿⣿⣿⣿⣿⠟⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢋⠔⣠⣾⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⢻⣿⣷⠸⣿⣿⣿⣿⣄⢻⠸⣿⣿⣿\n"
        .ascii "⡇⠀⠹⣿⣶⣶⣶⣿⣿⣿⣿⡏⢀⡆⡏⣿⣿⣿⣿⣛⡥⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢋⣴⢋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠸⣿⣿⡇⠘⣿⣿⣿⣿⡀⠀⣿⣿⣿\n"
        .ascii "⣧⠈⢀⠙⠿⣿⣿⣿⣿⡿⠃⠀⢸⠀⣧⠸⣿⣿⣿⡿⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣴⡿⢣⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢻⣿⡇⣠⠘⣿⣿⣿⣧⢰⣿⣿⣿\n"
        .ascii "⣿⣧⡈⠛⠶⣶⣢⣤⠖⢀⢀⡇⣾⠀⣿⣧⠸⣿⣿⢀⣼⣿⣿⣿⣿⣿⢏⣰⣿⣿⣿⠟⣠⣾⠿⢡⣾⣶⣶⣶⣶⣬⣍⣙⠻⠿⣿⣿⣿⣿⣿⣇⢸⣿⢱⣿⣆⠘⣿⣿⣿⠀⣿⣿⣿\n"
        .ascii "⣿⣿⣷⣄⠐⠿⢋⡁⢠⡇⢸⢃⣿⡀⢿⣿⣧⠈⠁⣾⣿⣿⣿⣿⠟⢡⣾⠿⢋⡈⢀⣾⡿⠉⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣈⠉⠙⠛⠿⠸⢀⣼⣿⣿⣄⠹⣿⣿⠀⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⡇⣾⠁⠸⢸⣿⡇⢸⣿⣿⠀⣰⣿⣿⣿⡟⢁⡴⠛⢁⣼⡿⢡⣿⣿⠁⣰⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠿⠿⠿⠿⣿⣶⣶⡆⢀⣾⣿⣿⡿⠉⢀⢹⡿⣰⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⡇⣿⠀⠀⢸⣿⣇⠘⣿⣿⠀⣿⣿⣿⣿⠖⢊⠔⣠⣿⡿⢣⣿⠟⠁⣰⡿⣿⣿⣿⡿⠿⠿⠓⠒⠛⠿⠿⣿⣇⣸⣿⣿⡿⢀⣾⣿⣿⠟⣥⠀⣸⠀⣡⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⠀⠀⣠⡇⢸⣿⣿⡆⠹⠏⢰⣿⣿⣭⣴⠟⢃⣴⣿⡟⣡⡿⢃⡔⢠⣿⣷⣦⣤⣤⣤⣤⣤⣤⡄⠀⠀⡀⠀⠒⠚⠛⢋⣴⣿⣿⡟⢡⠾⠃⠀⣿⠰⢸⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣛⣛⣡⣴⣾⣿⡇⢸⣿⡿⠁⣰⠦⢤⣍⡉⢭⣤⣴⣿⣿⣿⠟⠁⣴⣿⠁⣿⣿⣿⣿⣿⣷⣌⠻⣿⣿⡇⠀⠀⠉⣿⣼⣿⣿⣿⣿⣿⡏⠀⠠⠀⠀⠀⠐⠀⣾⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠸⣿⣿⠸⣏⣰⡂⣉⠛⢦⣌⠛⠛⠋⡁⣠⣾⣿⡟⣸⣿⣿⣿⣿⣿⣿⣿⣦⣌⣛⡣⠀⠀⠠⢿⣿⣿⣿⣿⣿⣿⣇⢸⡇⠀⠁⣿⣿⠁⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⢹⣿⠀⢻⣿⠏⣼⡳⠈⣙⠀⣴⣾⢰⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣶⣶⣤⣽⣿⣿⣿⣿⣿⣿⣆⠑⠀⠠⢿⣿⠀⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠈⢻⣷⠸⣿⠀⣿⠁⣾⣿⢀⣿⡏⣸⡿⢸⣇⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⡀⠸⣿⣇⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠙⢆⠹⣷⡻⣧⣉⠛⢸⣿⣷⣿⡇⡏⣿⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⣘⡇⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣤⣙⠀⠙⢿⣮⣝⡀⢸⣿⣿⣿⠰⠀⢹⠀⣿⣿⣿⣿⠛⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡁⣸⣿⡇⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣍⠻⠇⢸⣿⣿⡏⠀⣼⡄⠀⣿⣿⣿⡿⠁⠒⠂⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⢀⣿⣿⠁⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⢸⣿⣿⡇⠰⣿⣿⣀⢹⣿⡟⣰⣿⣿⢁⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣛⡛⠁⢠⠘⣿⡟⢀⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⡛⢋⠭⠅⠀⠀⠀⠀⠀⠉⠙⠛⠈⣿⣿⡇⢀⠻⣿⣿⡦⢉⣴⣿⣿⠃⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡗⢠⣿⠐⣿⡇⢸⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⠟⢉⠤⠒⠀⣀⣠⣤⣴⣶⣶⣶⣶⣶⣶⣶⡀⠀⣿⣿⡇⢸⣧⣈⠛⢠⣿⣿⣿⠏⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢱⣿⣿⠀⣿⠃⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⠁⢀⠀⢐⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢿⣿⡆⢸⣿⠏⣰⣿⣿⣿⠏⣠⡙⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⣾⣿⣿⡇⡿⢠⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⡟⢀⣾⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠸⣿⡇⠸⢁⣼⣿⣿⡿⢡⣾⣿⣿⣧⣤⣉⣙⠻⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⡿⢸⣿⣿⣿⡇⠁⣾⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⠁⣾⣿⠀⢻⣿⣿⣿⣿⣿⣿⣿⣯⣽⣿⣿⣿⠟⠁⣀⠀⢹⣧⠰⣿⣿⣿⡟⠀⣈⢻⣿⣿⣿⣿⣿⣿⣿⣷⣶⡄⠀⠀⠀⠀⠠⣤⣤⣤⣾⣿⣿⣿⠀⣸⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⠇⢠⣿⣿⡇⠸⣿⣿⣿⣿⣽⣿⣿⠗⠟⠉⣁⣤⣴⣩⣿⣧⡘⠟⢠⡙⢿⡟⣠⠀⣿⣆⠻⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⣿⣿⣷⡦⢌⠛⢿⣿⣿⣿⠟⣠⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⡟⢀⣾⣿⣿⣇⠀⣿⣿⣟⠄⠀⣠⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣷⡌⠀⢠⣌⢡⣿⣦⠹⣿⣧⠹⣿⣿⣿⣿⣿⣿⣿⠀⣀⠟⢿⣿⣿⣷⣿⣶⣤⡙⠛⠸⢿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⠉⡁⢸⣿⣿⣿⣿⡄⠀⢿⠃⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠈⠻⣦⡙⢟⡂⠹⣿⣧⡘⣿⣿⣿⣿⣿⣿⠀⠙⣦⣠⣀⠙⠛⠛⠛⢁⣠⣼⣷⣒⡤⠤⢭⡙⠛⠛⠻⣿\n"
        .ascii "⣿⣇⠀⢹⣿⣿⣿⣿⡀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠱⣼⣿⣦⡁⢤⢹⣿⣷⡜⢿⣿⣿⣿⣿⠀⠀⠙⣿⣿⣷⣶⣄⣈⠉⠻⠿⣿⠿⠷⠒⠀⣁⣠⠖⢀⣾\n"
        .ascii "⣿⣿⣷⠈⢻⣿⣿⣿⣷⡀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⣈⠻⣿⣿⣦⡀⢻⣿⣿⡎⠻⠛⠉⠁⢀⣠⠀⠹⢿⣿⣿⣿⡿⠿⠂⢀⣀⠴⣶⣶⣿⡿⠁⠀⣸⣿\n"
        .ascii "⣿⣿⣿⣷⣄⠙⣿⣿⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢇⣴⣾⣿⣦⠹⣿⣿⣷⣄⠙⣿⣿⣆⠐⢶⣿⣿⣿⠂⢰⣤⠤⠉⣁⣤⣶⡾⠋⣁⣶⣿⣿⠟⢁⠞⢰⣿⣿\n"
        .ascii "⢹⣿⣿⣿⣿⣦⡈⠙⠻⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣀⣿⣿⣿⠃⠀⣈⠻⣿⣿⣷⣌⠻⣿⣷⡀⠙⠋⠁⠀⢁⣤⣴⣿⣿⠟⢁⣴⣿⣿⣿⠟⠁⣠⣤⣾⣿⡶⢶\n"
        .ascii "⡆⠹⣿⣿⠿⠛⠑⢁⡄⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠠⠈⠻⣿⣿⣿⣦⣍⠻⢦⡀⠀⣾⣿⣿⣿⠟⢁⣴⣿⣿⣿⣿⠋⣠⣾⣿⣿⣿⠏⣠⣿\n"
        .ascii "⣿⣧⡙⠃⠀⣠⣾⡿⢁⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⢛⡋⢩⣤⣴⣶⣶⣶⣶⣷⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣶⣦⡈⠛⠛⢁⣴⣿⣿⣿⣿⡟⢡⣾⣿⣿⣿⡿⢁⣼⣿⣿\n"
        .ascii "⣿⠟⠉⢀⣾⣿⠏⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⣐⡲⠟⠛⠛⠛⠛⣉⠙⠛⠻⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⡙⠿⣿⣿⣿⠏⣀⠙⠿⣿⣿⠋⣠⣿⣿⣿⣿\n"
        .ascii "⠁⢀⣴⣿⣿⡿⠠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠁⠚⠛⠗⢂⣀⣤⣤⣤⣤⣴⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣈⠈⢁⣼⣿⣿⣤⠉⣁⣶⣿⣿⣿⣿⣿\n\0"
Cypher:
	.ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⣉⣩⠴⣴⣶⣶⠀⣍⣉⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⣴⣿⣿⣿⡧⢸⣿⣿⠀⣿⣿⣿⣆⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢰⣿⣿⣿⡿⢡⣿⣿⣿⣇⠻⣿⣿⣿⡆⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠛⣉⠀⣿⣿⣿⡟⢰⣿⠟⣉⠻⣿⡄⢿⣿⣿⣷⠀⢙⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⢛⣫⣥⣤⣌⠻⠿⡟⢠⣤⣬⣭⣭⣩⣤⡾⠛⠷⣄⠉⣠⣭⡍⢠⡄⠘⠛⣣⣤⣤⣬⣙⠛⠛⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⡛⠉⠉⢤⣤⣶⣿⣿⣿⣿⣿⣿⣿⡷⠀⣌⣛⠛⠻⢿⡟⢉⡴⠓⢦⡙⠧⡤⠀⠁⢛⣃⡀⠛⠛⠛⠿⠿⢿⣿⣿⣿⣶⣦⠄⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⢄⡈⠉⠁⠤⢤⣶⣶⣶⡶⢀⡛⠛⠻⢿⣶⡐⢧⡀⠚⠀⠛⢀⣶⡿⠟⠛⠋⣁⠘⢿⣿⣿⣿⣶⠶⠒⠀⢀⣤⠄⢡⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡜⠻⢷⣦⣤⣀⠉⠀⠲⣿⡿⠟⣣⣤⣤⣌⠀⠙⠒⠊⠀⣠⣤⣤⣤⣝⡛⠻⢿⡶⠈⠙⣉⣤⣴⡾⠿⢛⣡⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⡀⠙⠻⢿⣦⣄⠀⠀⠻⣿⣿⣿⣿⣰⣿⣿⣿⠀⣿⣿⣿⣿⣿⠟⠋⣠⣴⣾⣿⠟⠋⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⡀⠉⠛⣿⣦⣄⠈⠙⢿⣿⠇⣿⣿⣿⡆⣿⣿⠟⠋⢀⣤⣾⡿⠟⣡⡴⠁⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡤⠉⠳⣷⣤⡀⠐⠀⣿⣿⣿⡿⠈⠁⣠⣾⡿⠛⣡⣴⣾⠟⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⣴⣿⣶⠄⠙⠻⣗⣄⠈⠙⠋⢀⣴⡿⠃⠁⢴⣾⣿⡁⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢰⣦⠙⣿⣿⣄⠢⣀⠈⠛⠿⣶⡿⠛⠁⠀⠄⣡⣾⣿⠟⠁⣠⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢸⣿⣷⣌⠻⣿⣷⣌⣑⣀⣤⣉⣴⣾⣀⣁⣾⣿⣟⡡⢂⡼⠇⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⣷⣌⡛⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣉⣴⠟⣡⡄⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⣿⣿⣿⠁⢍⡻⢿⣷⣶⣾⣿⣿⣿⣿⣿⣋⣡⣾⠟⣡⣾⣿⡇⢀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⣴⣿⣿⠃⠆⡆⢉⡒⠮⢽⣿⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣧⡘⢦⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⢋⣤⣌⣉⠿⠟⡐⣸⣷⢸⣿⣷⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⢛⣀⣁⣰⣄⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢋⡡⠄⡀⠈⠉⠻⣿⡶⠀⠀⣿⠃⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⢉⣴⣌⠻⣿⣿⣿⡿⠅⠠⢙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⣿⣿⣿⠿⢋⣡⠖⠉⠀⠰⠊⠐⡊⠀⠈⣠⣾⣦⠁⠸⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠋⣡⡀⠙⢿⣿⣧⡈⠏⢉⠤⠀⢥⡀⢁⠢⢉⡻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⣿⣿⠿⠋⣡⠖⠋⢁⠰⢊⠁⢀⠴⠊⡠⠆⣐⠛⠋⣴⠆⡴⢀⣤⣍⣉⣉⠉⠉⢉⣡⣶⡶⠟⣃⣈⢳⣌⢢⣉⠻⣷⠌⢂⡁⠦⡀⠌⠐⠤⡀⠁⠢⣍⠛⢿⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣿⡿⠋⠠⡀⠐⠠⠖⠁⢂⡴⠊⢁⠀⢈⣴⣾⣿⠃⣾⠃⡞⢑⣊⣉⣭⣵⣶⡶⠿⢛⣉⣥⣶⣾⣿⣿⣦⠙⢦⡹⣧⠰⣶⣦⣍⠢⡈⠑⢤⡀⠈⡑⢆⡀⠉⠲⠌⠻⠛⢿⣿⣿⣿\n"
        .ascii "⣿⣿⠏⠈⠀⠈⠇⠀⢠⠖⡋⠀⠔⣀⣴⣿⣿⣿⠏⣼⠏⡞⢠⡿⠛⢛⣋⣩⣥⣶⣾⣿⣿⣿⣿⣿⣿⡿⢡⣶⡌⢧⠸⣧⠹⣿⣿⣷⣌⡂⢄⠘⠂⢄⡀⢙⠲⠌⣀⠄⢀⠘⣿⣿⣿\n"
        .ascii "⡿⠁⠀⢰⠗⠀⢀⠠⠀⣀⠔⣡⣾⣿⣿⣿⣿⡟⣰⡿⣸⢁⣿⢃⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢋⣴⣿⠟⣰⡆⢢⢻⣧⢻⣿⣿⣿⣿⣦⡐⢢⡀⠙⠂⠀⡰⠃⠀⡀⠀⠈⢿⣿\n"
        .ascii "⡿⢂⡀⠠⠐⣿⡄⢀⠛⠁⣾⣿⣿⣿⣿⣿⣿⠁⣿⠁⠃⣼⡇⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢡⣿⡿⢋⣴⣿⣷⠈⡄⣿⣄⢿⣿⣿⣿⣿⣿⣦⡙⢦⣤⡜⣡⠂⡘⠻⣷⡦⢀⠙\n"
        .ascii "⣼⣿⣿⣶⡌⠠⠛⢄⠢⠁⠹⣿⣿⣿⣿⣿⠟⢸⣿⣸⢠⣿⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣠⣿⡟⣰⣿⣿⣿⣿⣧⢹⠘⣿⠈⣿⣿⣿⣿⣿⣿⣿⡆⠙⢠⠃⣾⡿⠀⡅⠐⠒⠂\n"
        .ascii "⢸⣿⣿⣿⠟⣠⠰⡄⣄⠃⠡⢹⣿⣿⣿⣿⡆⣿⡇⡇⣾⡏⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣠⣿⠋⣼⣿⣿⣿⣿⣿⣿⡀⡆⣿⡇⢻⣿⣿⣿⣿⣿⡟⠐⡰⢁⠚⠁⠚⣡⣶⣿⣿⣿\n"
        .ascii "⠘⠛⢛⣡⣾⣿⠀⣿⢸⣆⠣⠀⠹⣿⣿⣿⡇⣿⡇⡇⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣴⣿⢃⣾⣿⣿⣿⣿⣿⣿⣿⡇⢸⢸⣿⢸⣿⣿⣿⣿⡟⠀⣰⢁⡆⣾⠁⣬⣛⠻⣿⣿⣿\n"
        .ascii "⢸⣿⣿⣿⣿⣿⡇⣿⠈⣿⣆⠡⠠⠸⣿⣿⡇⢿⠁⠀⢛⢀⣿⣿⣿⣿⣿⣿⣿⣿⡿⣠⣿⠃⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⣿⠘⣿⣿⣿⡟⠀⣰⢁⣾⠁⣿⢠⣿⣿⣷⣶⣬⣛\n"
        .ascii "⢸⣿⣿⣿⣿⣿⣧⢸⡄⣿⣿⣇⠠⠀⢈⣭⣥⡈⠀⣄⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⢁⣿⠋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡀⣿⠀⣿⣿⡟⡀⡐⢁⣾⣿⢠⡿⢸⣿⣿⣿⣿⣿⣿\n"
        .ascii "⡜⣿⣿⣿⣿⣿⣿⠘⡇⣿⣿⣿⣇⠐⡜⢿⣿⣿⠀⠁⠀⢸⣿⣿⣿⣿⣿⣿⡿⠁⣾⡟⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡇⢁⣴⣤⣤⡀⡘⢡⣾⣿⣿⢸⡇⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⡇⢿⣿⣿⣿⣿⣿⠀⣧⢹⣿⣿⣿⠀⣜⢨⣛⡛⠀⠀⢿⡈⢿⣿⣿⣿⠟⣋⣴⡿⢛⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡇⢿⣿⣿⠏⠀⢠⣿⣿⣿⣿⢸⠇⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⡸⣿⣿⣿⣿⣿⠆⣿⢸⣿⣿⣿⠈⣿⣆⠀⣶⣶⣶⣦⡙⢌⠻⠛⣡⣾⠟⣡⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⡑⠀⠀⠤⠌⣼⢸⣿⣿⣿⣿⢸⠀⣿⣿⣿⣿⣿⣿⣿\n"
        .ascii "⣿⣇⠸⣿⣿⠿⢁⡴⢃⣾⣿⣿⡟⢸⡿⢃⣾⣿⣿⣿⣿⣿⣆⢱⡟⢋⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⢿⣿⢸⣿⣿⣿⡏⢸⡀⣿⣿⣿⣿⣿⣿⣷\n"
        .ascii "⣿⣇⠰⣶⣶⡶⢉⣴⣿⣿⣿⣿⡇⣨⣴⣾⣿⣿⣿⣿⣿⣿⣿⡈⣧⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡘⢿⡆⢻⣿⣿⣿⣈⣷⣌⠻⣿⣿⠟⣋⡌\n"
        .ascii "⣿⣿⡆⢰⣿⣷⣿⣿⣿⣿⣿⣿⣇⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣥⡈⣿⣿⣿⣿⣿⣿⣷⣦⣶⣾⡿⢡\n"
        .ascii "⣿⣿⡇⢻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠇⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⡈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢠⣿\n"
        .ascii "⣿⣿⡷⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⠰⠄⢻⣿⣿⣿⣿⣿⣿⣿⡇⢸⡇⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿\n\0"
.text 
.global _start
_start:
 #Beginning
	mov rdx, 1
	call SetForeColor
	lea rdx, Valorant
	call PrintZString
	mov rdx, 7
	call SetForeColor
	lea rdx, Welcome
	call PrintZString
	mov rdx, 5
        call SetForeColor
        lea rdx, Jett
	call PrintZString
        mov rdx, 7
        call SetForeColor

First: 
	lea rdx, Players
	call PrintZString
	call ScanInt
	mov rax, rdx
	mov rdx, 3
        call SetForeColor
        lea rdx, Cypher
	call PrintZString
        mov rdx, 7
        call SetForeColor
	

#Set the register values

Second:
	sub rax, 1
	mov rcx, 0
	mov rbx, 0
	mov r9, 0

#Game time 

Third: 
	mov r9, [PlayerHealth + rcx * 8 ]
	cmp r9, 0
	jle Dead
	lea rdx, PlayerInfo
	call PrintZString
	mov rdx, [PlayerNumber + rbx * 8]
	call PrintInt
	lea rdx, Health
	call PrintZString
	mov rdi, [PlayerHealth + rcx * 8]
	mov rdx, rdi
	call PrintInt
Fourth:
	lea rdx, Target
	call PrintZString
	call ScanInt
	mov rsi, rdx
	cmp rsi, rax
	jg Fourth
	lea rdx, Damage1
	call PrintZString
	mov rdx, 100
	call Random
	mov rdi, rdx
	call PrintInt 
	lea rdx, Damage2
	call PrintZString
	sub [PlayerHealth + rsi * 8], rdi
	mov rdx, [PlayerHealth + rsi * 8]
	cmp rdx, 0
	jle Removed
#loops
 
Next1:
	cmp rbx, rax
	jl Next3
	jmp Next4 	
Next3:	
	add rbx, 1
	add rcx, 1
	jmp Third
Next4: 
	mov rbx, 0 
	mov rcx, 0
	jmp Third
#useless
Next5:
	add rcx, 1
	jmp Third	

#they are dying 

Removed: 
	lea rdx, Die
	call PrintZString
	sub rbx, 1
	sub rcx, 1	
	jmp Next3
Dead:
	#lea rdx, Die
	#call PrintZString
	jmp Next1

#nope 

Win: 
	lea rdx, Winner
	Call PrintZString
End: 
call Exit
