from googleapiclient.discovery import build
import pandas as pd
api_key = 'AIzaSyCRRrsLbuEOFRgwQTBFD8MpX815tBpiFZY'
youtube = build('youtube', 'v3', developerKey=api_key)

request = youtube.search().list(
    part='snippet',
    q='Python Programming',
    type='video',
    maxResults=6
)
response = request.execute()

data = {
    "Title": [],
    "Channel": []
}

for item in response['items']:
    data["Title"].append(item['snippet']['title'])
    data["Channel"].append(item['snippet']['channelTitle'])

df = pd.DataFrame(data)
df.to_csv('youtube_data.csv', index=False)
