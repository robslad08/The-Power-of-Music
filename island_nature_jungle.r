# Libraries 
library(dplyr) # for data manipulation
library(ggplot2) # for data visualization

# Data
songs <- read.csv("songs.csv")

# Exploratory analysis

# 1. Summary statistics
summary(songs)

# 2. Histogram of song length
ggplot(songs, aes(x = length)) + geom_histogram(bins = 25)

# 3. Scatterplot of danceability and loudness
ggplot(songs, aes(x = danceability, y = loudness)) + 
  geom_point(size = 3, color = "darkred")

# 4. Boxplot of song length by genre
ggplot(songs, aes(x = genre, y = length)) + 
  geom_boxplot(fill = "skyblue")

# More advanced analysis

# 5. Find the most danceable genre
top_danceability <- songs %>%
  group_by(genre) %>%
  summarise(mean_danceability = mean(danceability)) %>%
  arrange(desc(mean_danceability))

# 6. Find the most popular genre
top_popularity <- songs %>%
  group_by(genre) %>%
  summarise(mean_popularity = mean(popularity)) %>%
  arrange(desc(mean_popularity))

# 7. Find the most popular lyrical genre
top_lyrical <- songs %>%
  group_by(genre) %>%
  summarise(mean_lyrical = mean(lyrical)) %>%
  arrange(desc(mean_lyrical))

# 8. Find the most exciting genre
top_excitement <- songs %>%
  group_by(genre) %>%
  summarise(mean_excitement = mean(excitement)) %>%
  arrange(desc(mean_excitement))

# 9. Find the cheapest genre
top_cost <- songs %>%
  group_by(genre) %>%
  summarise(mean_cost = mean(cost)) %>%
  arrange(asc(mean_cost))

# 10. Find the most uplifting genre
top_uplifting <- songs %>%
  group_by(genre) %>%
  summarise(mean_uplifting = mean(uplifting)) %>%
  arrange(desc(mean_uplifting))

# Conclusions

# 11. Summary
summary(top_danceability)
summary(top_popularity)
summary(top_lyrical)
summary(top_excitement)
summary(top_cost)
summary(top_uplifting)

# 12. Summary tables
top_danceability_table <- top_danceability %>%
  mutate(rank = rank(-mean_danceability))

top_popularity_table <- top_popularity %>%
  mutate(rank = rank(-mean_popularity))
  
top_lyrical_table <- top_lyrical %>%
  mutate(rank = rank(-mean_lyrical))
  
top_excitement_table <- top_excitement %>%
  mutate(rank = rank(-mean_excitement))
  
top_cost_table <- top_cost %>%
  mutate(rank = rank(-mean_cost))
  
top_uplifting_table <- top_uplifting %>%
  mutate(rank = rank(-mean_uplifting))

# 13. Bar plots
# Danceability
ggplot(top_danceability_table, aes(x = reorder(genre, rank), y = mean_danceability)) +
  geom_bar(stat = "identity")

# Popularity
ggplot(top_popularity_table, aes(x = reorder(genre, rank), y = mean_popularity)) +
  geom_bar(stat = "identity")

# Lyrical
ggplot(top_lyrical_table, aes(x = reorder(genre, rank), y = mean_lyrical)) +
  geom_bar(stat = "identity")

# Excitement
ggplot(top_excitement_table, aes(x = reorder(genre, rank), y = mean_excitement)) +
  geom_bar(stat = "identity")

# Cost 
ggplot(top_cost_table, aes(x = reorder(genre, rank), y = mean_cost)) +
  geom_bar(stat = "identity")

# Uplifting
ggplot(top_uplifting_table, aes(x = reorder(genre, rank), y = mean_uplifting)) +
  geom_bar(stat = "identity")