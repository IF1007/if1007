# Git Commands Overview

## GIT Resources

Creating a new repository

```bash
mkdir project

cd project

git init

git remote add origin git@github.com:yourlogin/your-repo.git

git add .

git commit -am “new repository”

git push -u origin master
```

## Cloning existing repository

```bash
git clone https://github.com/username/your-repo.git
```

## Creating branch

```bash
git checkout -b feature-1

# you are now in a branch, you can edit and create new files

git add .

git commit -am “new feature”
```

## Merging branch to master

```bash
git checkout master

git merge feature-1

git push
```

## Deleting branch

```bash
git branch -d feature-x
```

## List all branches

```bash
git branch -a
```

## Switch branch

```bash
git checkout feature-x
```

## Switch to master branch

```bash
git checkout master
```

## Listing Remote repositories

```bash
git remote -v
```

##Replacing remote repository

```bash
# in case your remote repository changes, or you want to switch from HTTPS->SSH or SSH->HTTPS

git remote remove origin

git remote add origin git@github.com:yourlogin/your-repo.git
```

## More resources

git commands: https://www.atlassian.com/git/tutorials/comparing-workflows/

git flow: http://danielkummer.github.io/git-flow-cheatsheet/