# course 0 - understand shell

## set 0 - how looks

The shell looks like this:

```
hostname:~ username$
```

The mouse is not allowed, you can just use your keyboard for write commands.

All the commands have a similar syntax:

```
command [<parameters> [<parameters> [...]]]
```

## set 1 - file system

All the UNIX based file systems have a similar tree structure:

![UNIX File system](img/set1/file-system.gif)

The top of the tree is called `root directory`, root of the disk, every step down you must insert an
`/` in between the names of the directories, like `/home/sue/Pictures/pets/fido.jpg`.

On each directory or file, there are some permissions, they are about the owner of the file, the
group owner and everybody, for one of this permissions kind you can chose the if he can `read`,
`write` and `execute`.

If you want to indicate the local folder where you are you can use the `.` to indicate relative path
that mean that the path must be relative from your actual position. Otherwise you can use a `/` and
you must to insert the path from the root directory.

If you are in an subdirectory and you want to return up you one level, you must to use `..` instead
of the name of the folder. So if you are in the folder `pets` and you want to go up to the folder
`Pictures` you use `../`, and if you want to go in the directory `sue` you must use `../..`.

