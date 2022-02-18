Please see bellow a wrong program output 
```

Input command: c 20 20
CommandNewCanvas ✓
----------------------
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
|                    |
----------------------


Input command: l 0 0 19 19
CommandLine ✓
----------------------
|x                   |
| x                  |
|  x                 |
|   x                |
|    x               |
|     x              |
|      x             |
|       x            |
|        x           |
|         x          |
|          x         |
|           x        |
|            x       |
|             x      |
|              x     |
|               x    |
|                x   |
|                 x  |
|                  x |
|                   x|
----------------------


Input command: l 0 10 10
Verify your input! Error message: Arguments for CommandLine should have 4 coordinates which represent as 4 integer values

Input command: l 0 10 10 10
CommandLine ✓
----------------------
|x                   |
| x                  |
|  x                 |
|   x                |
|    x               |
|     x              |
|      x             |
|       x            |
|        x           |
|         x          |
|xxxxxxxxxxx         |
|           x        |
|            x       |
|             x      |
|              x     |
|               x    |
|                x   |
|                 x  |
|                  x |
|                   x|
----------------------


Input command: b 3 5 o
CommandBucketFill ✓
----------------------
|x                   |
|ox                  |
|oox                 |
|ooox                |
|oooox               |
|ooooox              |
|oooooox             |
|ooooooox            |
|oooooooox           |
|ooooooooox          |
|xxxxxxxxxxx         |
|           x        |
|            x       |
|             x      |
|              x     |
|               x    |
|                x   |
|                 x  |
|                  x |
|                   x|
----------------------


Input command: l 10 0 10 10
CommandLine ✓
----------------------
|x         x         |
|ox                  |
|oox                 |
|ooox                |
|oooox               |
|ooooox              |
|oooooox             |
|ooooooox            |
|oooooooox           |
|ooooooooox          |
|xxxxxxxxxxx         |
|           x        |
|            x       |
|             x      |
|              x     |
|               x    |
|                x   |
|                 x  |
|                  x |
|                   x|
----------------------


Input command: b 19 0 i
CommandBucketFill ✓
----------------------
|xiiiiiiiiixiiiiiiiii|
|oxiiiiiiiiiiiiiiiiii|
|ooxiiiiiiiiiiiiiiiii|
|oooxiiiiiiiiiiiiiiii|
|ooooxiiiiiiiiiiiiiii|
|oooooxiiiiiiiiiiiiii|
|ooooooxiiiiiiiiiiiii|
|oooooooxiiiiiiiiiiii|
|ooooooooxiiiiiiiiiii|
|oooooooooxiiiiiiiiii|
|xxxxxxxxxxxiiiiiiiii|
|           xiiiiiiii|
|            xiiiiiii|
|             xiiiiii|
|              xiiiii|
|               xiiii|
|                xiii|
|                 xii|
|                  xi|
|                   x|
----------------------


Input command: r 10 10 20 20
[WARN] CommandRectangle was partially applied (there were some invisible pixels)
----------------------
|xiiiiiiiiixiiiiiiiii|
|oxiiiiiiiiiiiiiiiiii|
|ooxiiiiiiiiiiiiiiiii|
|oooxiiiiiiiiiiiiiiii|
|ooooxiiiiiiiiiiiiiii|
|oooooxiiiiiiiiiiiiii|
|ooooooxiiiiiiiiiiiii|
|oooooooxiiiiiiiiiiii|
|ooooooooxiiiiiiiiiii|
|oooooooooxiiiiiiiiii|
|xxxxxxxxxxxxxxxxxxxx|
|           xiiiiiiii|
|            xiiiiiii|
|             xiiiiii|
|              xiiiii|
|               xiiii|
|                xiii|
|                 xii|
|                  xi|
|                   x|
----------------------


Input command: b 11 19 Y
CommandBucketFill ✓
----------------------
|xiiiiiiiiixiiiiiiiii|
|oxiiiiiiiiiiiiiiiiii|
|ooxiiiiiiiiiiiiiiiii|
|oooxiiiiiiiiiiiiiiii|
|ooooxiiiiiiiiiiiiiii|
|oooooxiiiiiiiiiiiiii|
|ooooooxiiiiiiiiiiiii|
|oooooooxiiiiiiiiiiii|
|ooooooooxiiiiiiiiiii|
|oooooooooxiiiiiiiiii|
|xxxxxxxxxxxxxxxxxxxx|
|YYYYYYYYYYYxiiiiiiii|
|YYYYYYYYYYYYxiiiiiii|
|YYYYYYYYYYYYYxiiiiii|
|YYYYYYYYYYYYYYxiiiii|
|YYYYYYYYYYYYYYYxiiii|
|YYYYYYYYYYYYYYYYxiii|
|YYYYYYYYYYYYYYYYYxii|
|YYYYYYYYYYYYYYYYYYxi|
|YYYYYYYYYYYYYYYYYYYx|
----------------------


Input command: l 10 10 0 20
[WARN] CommandLine was partially applied (there were some invisible pixels)
----------------------
|xiiiiiiiiixiiiiiiiii|
|oxiiiiiiiiiiiiiiiiii|
|ooxiiiiiiiiiiiiiiiii|
|oooxiiiiiiiiiiiiiiii|
|ooooxiiiiiiiiiiiiiii|
|oooooxiiiiiiiiiiiiii|
|ooooooxiiiiiiiiiiiii|
|oooooooxiiiiiiiiiiii|
|ooooooooxiiiiiiiiiii|
|oooooooooxiiiiiiiiii|
|xxxxxxxxxxxxxxxxxxxx|
|YYYYYYYYYxYxiiiiiiii|
|YYYYYYYYxYYYxiiiiiii|
|YYYYYYYxYYYYYxiiiiii|
|YYYYYYxYYYYYYYxiiiii|
|YYYYYxYYYYYYYYYxiiii|
|YYYYxYYYYYYYYYYYxiii|
|YYYxYYYYYYYYYYYYYxii|
|YYxYYYYYYYYYYYYYYYxi|
|YxYYYYYYYYYYYYYYYYYx|
----------------------


Input command: b 0  11  *
Verify your input! Error message: Arguments for CommandBucketFill should have 4 coordinates which represent as 4 integer values

Input command: b 9 19 +  
CommandBucketFill ✓
----------------------
|xiiiiiiiiixiiiiiiiii|
|oxiiiiiiiiiiiiiiiiii|
|ooxiiiiiiiiiiiiiiiii|
|oooxiiiiiiiiiiiiiiii|
|ooooxiiiiiiiiiiiiiii|
|oooooxiiiiiiiiiiiiii|
|ooooooxiiiiiiiiiiiii|
|oooooooxiiiiiiiiiiii|
|ooooooooxiiiiiiiiiii|
|oooooooooxiiiiiiiiii|
|xxxxxxxxxxxxxxxxxxxx|
|YYYYYYYYYx+xiiiiiiii|
|YYYYYYYYx+++xiiiiiii|
|YYYYYYYx+++++xiiiiii|
|YYYYYYx+++++++xiiiii|
|YYYYYx+++++++++xiiii|
|YYYYx+++++++++++xiii|
|YYYx+++++++++++++xii|
|YYx+++++++++++++++xi|
|Yx+++++++++++++++++x|
----------------------


Input command: b 1 5 -
CommandBucketFill ✓
----------------------
|xiiiiiiiiixiiiiiiiii|
|-xiiiiiiiiiiiiiiiiii|
|--xiiiiiiiiiiiiiiiii|
|---xiiiiiiiiiiiiiiii|
|----xiiiiiiiiiiiiiii|
|-----xiiiiiiiiiiiiii|
|------xiiiiiiiiiiiii|
|-------xiiiiiiiiiiii|
|--------xiiiiiiiiiii|
|---------xiiiiiiiiii|
|xxxxxxxxxxxxxxxxxxxx|
|YYYYYYYYYx+xiiiiiiii|
|YYYYYYYYx+++xiiiiiii|
|YYYYYYYx+++++xiiiiii|
|YYYYYYx+++++++xiiiii|
|YYYYYx+++++++++xiiii|
|YYYYx+++++++++++xiii|
|YYYx+++++++++++++xii|
|YYx+++++++++++++++xi|
|Yx+++++++++++++++++x|
----------------------


Input command: b 5 1 =
CommandBucketFill ✓
----------------------
|x=========x=========|
|-x==================|
|--x=================|
|---x================|
|----x===============|
|-----x==============|
|------x=============|
|-------x============|
|--------x===========|
|---------x==========|
|xxxxxxxxxxxxxxxxxxxx|
|YYYYYYYYYx+xiiiiiiii|
|YYYYYYYYx+++xiiiiiii|
|YYYYYYYx+++++xiiiiii|
|YYYYYYx+++++++xiiiii|
|YYYYYx+++++++++xiiii|
|YYYYx+++++++++++xiii|
|YYYx+++++++++++++xii|
|YYx+++++++++++++++xi|
|Yx+++++++++++++++++x|
----------------------


Input command: q
Quit ✓
----------------------
|x=========x=========|
|-x==================|
|--x=================|
|---x================|
|----x===============|
|-----x==============|
|------x=============|
|-------x============|
|--------x===========|
|---------x==========|
|xxxxxxxxxxxxxxxxxxxx|
|YYYYYYYYYx+xiiiiiiii|
|YYYYYYYYx+++xiiiiiii|
|YYYYYYYx+++++xiiiiii|
|YYYYYYx+++++++xiiiii|
|YYYYYx+++++++++xiiii|
|YYYYx+++++++++++xiii|
|YYYx+++++++++++++xii|
|YYx+++++++++++++++xi|
|Yx+++++++++++++++++x|
----------------------

``` 






we would expect result as 
```
----------------------
|x=========xiiiiiiiii|
|-x========xiiiiiiiii|
|--x=======xiiiiiiiii|
|---x======xiiiiiiiii|
|----x=====xiiiiiiiii|
|-----x====xiiiiiiiii|
|------x===xiiiiiiiii|
|-------x==xiiiiiiiii|
|--------x=xiiiiiiiii|
|---------xxiiiiiiiii|
|xxxxxxxxxxxxxxxxxxxx|
|*********xxxiiiiiiii|
|********x+xYxiiiiiii|
|*******x++xYYxiiiiii|
|******x+++xYYYxiiiii|
|*****x++++xYYYYxiiii|
|****x+++++xYYYYYxiii|
|***x++++++xYYYYYYxii|
|**x+++++++xYYYYYYYxi|
|*x++++++++xYYYYYYYYx|
----------------------

```
