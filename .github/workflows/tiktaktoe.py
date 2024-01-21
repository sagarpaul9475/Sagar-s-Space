import pygame
import sys

# Initialize Pygames
pygame.init()

# Constants
WIDTH, HEIGHT = 600, 600
LINE_WIDTH = 15
BOARD_ROWS, BOARD_COLS = 3, 3
SQUARE_SIZE = WIDTH // BOARD_COLS

# Colors
WHITE = (255, 255, 255)
LINE_COLOR = (0, 0, 0)

# Initialize the screen
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Tic Tac Toe")

# Fonts
font = pygame.font.Font(None, 74)

# Initialize the board
board = [['' for _ in range(BOARD_COLS)] for _ in range(BOARD_ROWS)]

# Functions
def draw_board():
    for row in range(1, BOARD_ROWS):
        pygame.draw.line(screen, LINE_COLOR, (0, row * SQUARE_SIZE), (WIDTH, row * SQUARE_SIZE), LINE_WIDTH)
    for col in range(1, BOARD_COLS):
        pygame.draw.line(screen, LINE_COLOR, (col * SQUARE_SIZE, 0), (col * SQUARE_SIZE, HEIGHT), LINE_WIDTH)

def draw_symbols():
    for row in range(BOARD_ROWS):
        for col in range(BOARD_COLS):
            symbol = font.render(board[row][col], True, LINE_COLOR)
            x = col * SQUARE_SIZE + SQUARE_SIZE // 2 - symbol.get_width() // 2
            y = row * SQUARE_SIZE + SQUARE_SIZE // 2 - symbol.get_height() // 2
            screen.blit(symbol, (x, y))

def check_win():
    for row in range(BOARD_ROWS):
        if board[row][0] == board[row][1] == board[row][2] != '':
            return True
    for col in range(BOARD_COLS):
        if board[0][col] == board[1][col] == board[2][col] != '':
            return True
    if board[0][0] == board[1][1] == board[2][2] != '':
        return True
    if board[0][2] == board[1][1] == board[2][0] != '':
        return True
    return False

def is_board_full():
    return all(board[row][col] != '' for row in range(BOARD_ROWS) for col in range(BOARD_COLS))

def main():
    
    player_turn = 'X'
    
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                sys.exit()
            elif event.type == pygame.MOUSEBUTTONDOWN and event.button == 1:
                x, y = event.pos
                col = x // SQUARE_SIZE
                row = y // SQUARE_SIZE
                if 0 <= row < BOARD_ROWS and 0 <= col < BOARD_COLS and board[row][col] == '':
                    board[row][col] = player_turn
                    if check_win():
                        print(f"Player {player_turn} wins!")
                        pygame.quit()
                        sys.exit()
                    elif is_board_full():
                        print("It's a draw!")
                        pygame.quit()
                        sys.exit()
                    player_turn = 'O' if player_turn == 'X' else 'X'
        
        screen.fill(WHITE)
        draw_board()
        draw_symbols()
        pygame.display.flip()

if __name__ == "__main__":
    main()

