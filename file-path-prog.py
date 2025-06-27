# File Path Program

def main():
    print("Current file path:", __file__)
    print("Hello to a world!")
    

if __name__ == "__main__":
    print("This script is being run directly.")
    main()
else:
    print("This script is being imported, not run directly.")
    main()
    