import secrets
import string

def generate_random_string(num):
    return ''.join(secrets.choice(string.ascii_letters + string.digits) for _ in range(num))

def complex_secret_code(message, coding):
    words = message.split()
    new_words = []

    for word in words:
        if len(word) >= 3:
            if coding:
                random_prefix = generate_random_string(3)
                random_suffix = generate_random_string(3)
                new_word = ''.join(secrets.choice(string.ascii_letters + string.digits) for _ in range(3)) + random_prefix + ''.join(secrets.choice(string.ascii_letters + string.digits) for _ in range(3)) + word[1:] + word[0] + ''.join(secrets.choice(string.ascii_letters + string.digits) for _ in range(3)) + random_suffix + ''.join(secrets.choice(string.ascii_letters + string.digits) for _ in range(3))
            else:
                new_word = word[6:-6]
                new_word = new_word[-1] + new_word[:-1]
        else:
            new_word = word[::-1]

        new_words.append(new_word)

    return ' '.join(new_words)

message = input("Enter message: ")
coding = input("1 for Coding or 0 for Decoding: ")
coding = True if coding == "1" else False

result = complex_secret_code(message, coding)
print(result)
