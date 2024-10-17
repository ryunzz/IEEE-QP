# Hello IEEE QP Team 1!

This will be our Git Hub repo for our project! If you have any ideas or things that you're going to work on please let the discord gc know before doing so :D



U can use this document to learn/remind urself the process for creating and managing feature branches and keeping them in sync with the `main` branch to ensure we dont have lots of merge conflicts.

---

## 1. Setup

### Clone the repository

Start by cloning the repository and navigating to the project directory:

if u wanna do this using the command line u do;

```bash
echo "# IEEE-QP" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/ryunzz/IEEE-QP.git
git push -u origin main
```


or push an existing repository from the command line;

```bash
git remote add origin https://github.com/ryunzz/IEEE-QP.git
git branch -M main
git push -u origin main
```


## 2. Working with Feature Branches

### Creating a Feature Branch

When starting a new feature, **always** create a new branch from the latest `main` branch. Follow these steps:

1. **Open the project in VS Code**:

   In your terminal, from the project directory, run:

   ```bash
   code .
   ```

2. **Update your local main branch**:

Before creating a new branch, ensure your main branch is up-to-date:

```bash
git checkout main
git pull origin main
```

3. **Create a new feature branch**:

Use the following command to create your feature branch, following the convention feature/feature-name:

```bash
git checkout -b feature/your-feature-name
```

4. **Push your new branch to the remote repository:**:

```bash
git push -u origin feature/your-feature-name
```

After u pushed ur feature branch, you'll open a pull request (PR) and having it reviewed by someone else on our team. Here's how it works:

1. **Open a Pull Request (PR)**:

   - After pushing your feature branch, go to the repository on GitHub.
   - You should see a prompt to create a pull request for your branch.
   - Click "Compare & pull request" and provide a meaningful title and description for your feature.
   - Be sure to explain what the feature does and highlight any important changes.

2. **Assign Reviewers**:

   - After creating the pull request, assign someone to review it (also u can js say smth in the discord).
   - Then the reviewer will check check ur code
   - Lets try to leave comments or request changes to improve the code or fix bugs if applicable
